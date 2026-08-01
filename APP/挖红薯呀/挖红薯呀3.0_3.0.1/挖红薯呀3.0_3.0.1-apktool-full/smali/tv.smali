.class public final Ltv;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final d:Lr3;


# instance fields
.field public final a:Lqr;

.field public b:I

.field public final c:Lxl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr3;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ltv;->d:Lr3;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lqr;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ltv;->b:I

    .line 6
    .line 7
    new-instance v0, Lxl;

    .line 8
    .line 9
    invoke-direct {v0}, Lxl;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ltv;->c:Lxl;

    .line 13
    .line 14
    iput-object p1, p0, Ltv;->a:Lqr;

    .line 15
    .line 16
    return-void
.end method
