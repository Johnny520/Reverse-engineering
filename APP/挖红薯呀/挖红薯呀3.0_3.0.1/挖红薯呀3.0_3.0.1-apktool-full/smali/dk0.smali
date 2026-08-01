.class public final synthetic Ldk0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lwt0;

.field public final synthetic c:Lwt0;

.field public final synthetic d:Lxt0;

.field public final synthetic e:Lxt0;

.field public final synthetic f:Lvt0;

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILandroid/content/Context;Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldk0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldk0;->b:Lwt0;

    .line 8
    .line 9
    iput-object p2, p0, Ldk0;->c:Lwt0;

    .line 10
    .line 11
    iput-object p3, p0, Ldk0;->d:Lxt0;

    .line 12
    .line 13
    iput-object p4, p0, Ldk0;->e:Lxt0;

    .line 14
    .line 15
    iput-object p5, p0, Ldk0;->f:Lvt0;

    .line 16
    .line 17
    iput p6, p0, Ldk0;->g:I

    .line 18
    .line 19
    iput p7, p0, Ldk0;->h:I

    .line 20
    .line 21
    iput p8, p0, Ldk0;->i:I

    .line 22
    .line 23
    iput p9, p0, Ldk0;->j:I

    .line 24
    .line 25
    iput-object p10, p0, Ldk0;->k:Landroid/content/Context;

    .line 26
    .line 27
    iput-object p11, p0, Ldk0;->l:Ljava/lang/Object;

    .line 28
    .line 29
    return-void
.end method

.method public synthetic constructor <init>(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILjava/lang/Object;Landroid/content/Context;)V
    .locals 1

    .line 30
    const/4 v0, 0x1

    iput v0, p0, Ldk0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldk0;->b:Lwt0;

    iput-object p2, p0, Ldk0;->c:Lwt0;

    iput-object p3, p0, Ldk0;->d:Lxt0;

    iput-object p4, p0, Ldk0;->e:Lxt0;

    iput-object p5, p0, Ldk0;->f:Lvt0;

    iput p6, p0, Ldk0;->g:I

    iput p7, p0, Ldk0;->h:I

    iput p8, p0, Ldk0;->i:I

    iput p9, p0, Ldk0;->j:I

    iput-object p10, p0, Ldk0;->l:Ljava/lang/Object;

    iput-object p11, p0, Ldk0;->k:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 14

    .line 1
    iget v0, p0, Ldk0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v10, p0, Ldk0;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v11, p0, Ldk0;->k:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v1, p0, Ldk0;->b:Lwt0;

    .line 11
    .line 12
    iget-object v2, p0, Ldk0;->c:Lwt0;

    .line 13
    .line 14
    iget-object v3, p0, Ldk0;->d:Lxt0;

    .line 15
    .line 16
    iget-object v4, p0, Ldk0;->e:Lxt0;

    .line 17
    .line 18
    iget-object v5, p0, Ldk0;->f:Lvt0;

    .line 19
    .line 20
    iget v6, p0, Ldk0;->g:I

    .line 21
    .line 22
    iget v7, p0, Ldk0;->h:I

    .line 23
    .line 24
    iget v8, p0, Ldk0;->i:I

    .line 25
    .line 26
    iget v9, p0, Ldk0;->j:I

    .line 27
    .line 28
    move-object v12, p1

    .line 29
    move-object/from16 v13, p2

    .line 30
    .line 31
    invoke-static/range {v1 .. v13}, Lvs0;->b(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILjava/lang/Object;Landroid/content/Context;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :pswitch_0
    iget-object v0, p0, Ldk0;->l:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v10, v0

    .line 39
    check-cast v10, Landroid/app/Activity;

    .line 40
    .line 41
    iget-object v0, p0, Ldk0;->b:Lwt0;

    .line 42
    .line 43
    iget-object v1, p0, Ldk0;->c:Lwt0;

    .line 44
    .line 45
    iget-object v2, p0, Ldk0;->d:Lxt0;

    .line 46
    .line 47
    iget-object v3, p0, Ldk0;->e:Lxt0;

    .line 48
    .line 49
    iget-object v4, p0, Ldk0;->f:Lvt0;

    .line 50
    .line 51
    iget v5, p0, Ldk0;->g:I

    .line 52
    .line 53
    iget v6, p0, Ldk0;->h:I

    .line 54
    .line 55
    iget v7, p0, Ldk0;->i:I

    .line 56
    .line 57
    iget v8, p0, Ldk0;->j:I

    .line 58
    .line 59
    iget-object v9, p0, Ldk0;->k:Landroid/content/Context;

    .line 60
    .line 61
    move-object v11, p1

    .line 62
    move-object/from16 v12, p2

    .line 63
    .line 64
    invoke-static/range {v0 .. v12}, Lfk0;->h(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILandroid/content/Context;Landroid/app/Activity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
