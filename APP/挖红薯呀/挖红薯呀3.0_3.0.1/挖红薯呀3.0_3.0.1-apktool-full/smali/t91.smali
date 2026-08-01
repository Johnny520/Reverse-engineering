.class public final Lt91;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field private static final a:Lda1;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lda1;

    .line 2
    .line 3
    sget-object v4, Lzv;->f:Lzv;

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    invoke-static {v1}, Lj50;->q(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    const/16 v1, 0x18

    .line 12
    .line 13
    invoke-static {v1}, Lj50;->q(I)J

    .line 14
    .line 15
    .line 16
    move-result-wide v7

    .line 17
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 18
    .line 19
    invoke-static {v5, v6}, Lj50;->p(D)J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    new-instance v1, Ls71;

    .line 24
    .line 25
    const v9, 0xfdff59

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v1 .. v9}, Ls71;-><init>(JLzv;JJI)V

    .line 29
    .line 30
    .line 31
    const/16 v2, 0x7dff

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lda1;-><init>(Ls71;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lt91;->a:Lda1;

    .line 37
    .line 38
    return-void
.end method

.method public static final a()Lda1;
    .locals 1

    .line 1
    sget-object v0, Lt91;->a:Lda1;

    .line 2
    .line 3
    return-object v0
.end method
