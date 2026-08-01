.class public final Lmm0;
.super Lpm0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final c:Lmm0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lmm0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, Lpm0;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lmm0;->c:Lmm0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lrm0;Lq8;Lz11;Liu0;Lqm0;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Lrm0;->b(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    const/4 p3, 0x1

    .line 7
    invoke-virtual {p1, p3}, Lrm0;->b(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lww;

    .line 12
    .line 13
    invoke-interface {p2, p1, p0}, Lq8;->i(Lww;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
