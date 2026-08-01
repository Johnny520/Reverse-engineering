.class public final synthetic Lbk0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:Lwt0;

.field public final synthetic b:Lwt0;

.field public final synthetic c:Lxt0;

.field public final synthetic d:Lxt0;

.field public final synthetic e:Lvt0;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILandroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbk0;->a:Lwt0;

    .line 5
    .line 6
    iput-object p2, p0, Lbk0;->b:Lwt0;

    .line 7
    .line 8
    iput-object p3, p0, Lbk0;->c:Lxt0;

    .line 9
    .line 10
    iput-object p4, p0, Lbk0;->d:Lxt0;

    .line 11
    .line 12
    iput-object p5, p0, Lbk0;->e:Lvt0;

    .line 13
    .line 14
    iput p6, p0, Lbk0;->f:I

    .line 15
    .line 16
    iput p7, p0, Lbk0;->g:I

    .line 17
    .line 18
    iput p8, p0, Lbk0;->h:I

    .line 19
    .line 20
    iput p9, p0, Lbk0;->i:I

    .line 21
    .line 22
    iput-object p10, p0, Lbk0;->j:Landroid/app/Activity;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    iget v8, p0, Lbk0;->i:I

    .line 2
    .line 3
    iget-object v9, p0, Lbk0;->j:Landroid/app/Activity;

    .line 4
    .line 5
    iget-object v0, p0, Lbk0;->a:Lwt0;

    .line 6
    .line 7
    iget-object v1, p0, Lbk0;->b:Lwt0;

    .line 8
    .line 9
    iget-object v2, p0, Lbk0;->c:Lxt0;

    .line 10
    .line 11
    iget-object v3, p0, Lbk0;->d:Lxt0;

    .line 12
    .line 13
    iget-object v4, p0, Lbk0;->e:Lvt0;

    .line 14
    .line 15
    iget v5, p0, Lbk0;->f:I

    .line 16
    .line 17
    iget v6, p0, Lbk0;->g:I

    .line 18
    .line 19
    iget v7, p0, Lbk0;->h:I

    .line 20
    .line 21
    move-object v10, p1

    .line 22
    move-object v11, p2

    .line 23
    invoke-static/range {v0 .. v11}, Lck0;->b(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILandroid/app/Activity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method
