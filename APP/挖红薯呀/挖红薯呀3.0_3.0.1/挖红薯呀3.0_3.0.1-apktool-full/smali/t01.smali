.class public final Lt01;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lp40;


# instance fields
.field public final synthetic d:Lwm;


# direct methods
.method public constructor <init>(Lwm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt01;->d:Lwm;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lvm;

    .line 2
    .line 3
    iget-object p0, p0, Lt01;->d:Lwm;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lvm;-><init>(Lwm;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
