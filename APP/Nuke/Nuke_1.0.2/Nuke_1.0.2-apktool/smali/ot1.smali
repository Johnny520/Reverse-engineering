.class public final Lot1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Lhx2;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lot1;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, Lta;

    .line 7
    .line 8
    const/16 v0, 0x11

    .line 9
    .line 10
    invoke-direct {p1, v0, p0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lhx2;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lhx2;-><init>(Lxm0;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lot1;->b:Lhx2;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Lfm1;
    .locals 0

    .line 1
    iget-object p0, p0, Lot1;->b:Lhx2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lmt1;

    .line 8
    .line 9
    iget-object p0, p0, Lmt1;->c:Lfm1;

    .line 10
    .line 11
    return-object p0
.end method

.method public final b(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lot1;->a()Lfm1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lht1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, Lht1;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-virtual {v0, v1, v3}, Lfm1;->c(Lht1;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lot1;->a()Lfm1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, Lht1;

    .line 20
    .line 21
    const v1, 0xf4240

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p1, v1}, Lht1;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0, v2}, Lfm1;->c(Lht1;I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
