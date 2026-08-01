.class public final Lhm0;
.super Lpm0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final c:Lhm0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lhm0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v2}, Lpm0;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lhm0;->c:Lhm0;

    .line 9
    .line 10
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
    check-cast p0, Lhw;

    .line 7
    .line 8
    iget-object p1, p4, Liu0;->g:Lsh0;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
