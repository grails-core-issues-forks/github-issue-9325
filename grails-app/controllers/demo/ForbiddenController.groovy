package demo

class ForbiddenController {

    def index() {
        render status: 403
    }
}