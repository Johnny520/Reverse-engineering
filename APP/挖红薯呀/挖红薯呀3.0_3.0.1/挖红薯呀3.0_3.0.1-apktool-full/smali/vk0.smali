.class public final Lvk0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Lwk0;

.field public b:Z

.field public c:Lri0;

.field public final d:Lcl0;


# direct methods
.method public constructor <init>(Lcl0;Lwk0;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lcl0;->b:Z

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lvk0;->a:Lwk0;

    .line 7
    .line 8
    iput-boolean v0, p0, Lvk0;->b:Z

    .line 9
    .line 10
    iput-object p1, p0, Lvk0;->d:Lcl0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lvk0;->d:Lcl0;

    .line 4
    .line 5
    iget-boolean p1, p1, Lcl0;->b:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    iget-boolean v0, p0, Lvk0;->b:Z

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iput-boolean p1, p0, Lvk0;->b:Z

    .line 18
    .line 19
    iget-object p0, p0, Lvk0;->c:Lri0;

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    iget-object p0, p0, Lri0;->b:Lui0;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lui0;->b()V

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_1
    return-void
.end method
