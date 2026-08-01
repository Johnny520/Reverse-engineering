.class public abstract Lc10;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lej;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La00;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, La00;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lej;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lej;-><init>(Lhw;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lc10;->a:Lej;

    .line 13
    .line 14
    return-void
.end method

.method public static final a(Lpe0;Lg30;Lf10;)Lpe0;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    new-instance v0, Ld10;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Ld10;-><init>(Lg30;Lf10;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Lpe0;->c(Lpe0;)Lpe0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
