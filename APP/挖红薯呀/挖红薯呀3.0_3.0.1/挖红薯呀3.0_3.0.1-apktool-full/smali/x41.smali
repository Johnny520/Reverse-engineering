.class public final Lx41;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:La51;

.field public b:Lq60;

.field public final c:Lw41;

.field public final d:Lw41;

.field public final e:Lw41;


# direct methods
.method public constructor <init>(La51;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx41;->a:La51;

    .line 5
    .line 6
    new-instance p1, Lw41;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, p0, v0}, Lw41;-><init>(Lx41;I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lx41;->c:Lw41;

    .line 13
    .line 14
    new-instance p1, Lw41;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p1, p0, v0}, Lw41;-><init>(Lx41;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lx41;->d:Lw41;

    .line 21
    .line 22
    new-instance p1, Lw41;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, v0}, Lw41;-><init>(Lx41;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lx41;->e:Lw41;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Lq60;
    .locals 0

    .line 1
    iget-object p0, p0, Lx41;->b:Lq60;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    .line 7
    .line 8
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method
