.class public abstract Lmr;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lp91;

.field public static final b:Lp91;

.field public static final c:Lp91;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lgl;

    .line 2
    .line 3
    const v1, 0x3ecccccd    # 0.4f

    .line 4
    .line 5
    .line 6
    const v2, 0x3f19999a    # 0.6f

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lgl;-><init>(FF)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lp91;

    .line 13
    .line 14
    sget-object v2, Lcr;->a:Lgl;

    .line 15
    .line 16
    const/16 v3, 0x78

    .line 17
    .line 18
    invoke-direct {v1, v3, v2}, Lp91;-><init>(ILbr;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lmr;->a:Lp91;

    .line 22
    .line 23
    new-instance v1, Lp91;

    .line 24
    .line 25
    const/16 v2, 0x96

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Lp91;-><init>(ILbr;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lmr;->b:Lp91;

    .line 31
    .line 32
    new-instance v1, Lp91;

    .line 33
    .line 34
    invoke-direct {v1, v3, v0}, Lp91;-><init>(ILbr;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lmr;->c:Lp91;

    .line 38
    .line 39
    return-void
.end method
