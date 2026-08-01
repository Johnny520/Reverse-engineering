.class public final Lbl0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Lx51;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbl0;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, Lk6;

    .line 7
    .line 8
    const/4 v0, 0x6

    .line 9
    invoke-direct {p1, v0, p0}, Lk6;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lx51;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lx51;-><init>(Lhw;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lbl0;->b:Lx51;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()Lri0;
    .locals 0

    .line 1
    iget-object p0, p0, Lbl0;->b:Lx51;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx51;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzk0;

    .line 8
    .line 9
    iget-object p0, p0, Lzk0;->c:Lri0;

    .line 10
    .line 11
    return-object p0
.end method

.method public final b(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbl0;->a()Lri0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lsk0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, Lsk0;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-virtual {v0, v1, v3}, Lri0;->b(Lsk0;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lbl0;->a()Lri0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, Lsk0;

    .line 20
    .line 21
    const v1, 0xf4240

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p1, v1}, Lsk0;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0, v2}, Lri0;->b(Lsk0;I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
