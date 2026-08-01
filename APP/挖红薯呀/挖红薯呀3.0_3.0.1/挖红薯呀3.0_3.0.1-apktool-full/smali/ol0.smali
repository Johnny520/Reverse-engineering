.class public final Lol0;
.super Lpm0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final c:Lol0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lol0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2}, Lpm0;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lol0;->c:Lol0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lrm0;Lq8;Lz11;Liu0;Lqm0;)V
    .locals 0

    .line 1
    iget p0, p3, Lz11;->t:I

    .line 2
    .line 3
    new-instance p1, Led;

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    invoke-direct {p1, p2, p4, p3}, Led;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, p0, p1}, Lz11;->n(ILww;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
