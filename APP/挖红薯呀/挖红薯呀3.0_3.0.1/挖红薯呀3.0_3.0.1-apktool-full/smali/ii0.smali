.class public final synthetic Lii0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Z

.field public final synthetic e:Lhw;


# direct methods
.method public synthetic constructor <init>(ZLhw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lii0;->d:Z

    .line 5
    .line 6
    iput-object p2, p0, Lii0;->e:Lhw;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lgv0;

    .line 2
    .line 3
    iget-boolean v0, p0, Lii0;->d:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/high16 p0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, Lii0;->e:Lhw;

    .line 11
    .line 12
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    :goto_0
    invoke-virtual {p1, p0}, Lgv0;->d(F)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lna1;->a:Lna1;

    .line 26
    .line 27
    return-object p0
.end method
