.class public abstract Lcr;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lgl;

.field public static final b:Lxc;


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
    const v2, 0x3e4ccccd    # 0.2f

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lgl;-><init>(FF)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcr;->a:Lgl;

    .line 13
    .line 14
    new-instance v0, Lgl;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v0, v3, v2}, Lgl;-><init>(FF)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lgl;

    .line 21
    .line 22
    const/high16 v2, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lgl;-><init>(FF)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lxc;

    .line 28
    .line 29
    const/16 v1, 0xb

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lxc;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcr;->b:Lxc;

    .line 35
    .line 36
    return-void
.end method
