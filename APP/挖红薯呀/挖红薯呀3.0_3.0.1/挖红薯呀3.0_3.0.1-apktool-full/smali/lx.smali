.class public final Llx;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lp01;


# instance fields
.field public final a:Lhw;

.field public final b:Lsw;


# direct methods
.method public constructor <init>(Lhw;Lsw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llx;->a:Lhw;

    .line 5
    .line 6
    iput-object p2, p0, Llx;->b:Lsw;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lkx;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lkx;-><init>(Llx;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
