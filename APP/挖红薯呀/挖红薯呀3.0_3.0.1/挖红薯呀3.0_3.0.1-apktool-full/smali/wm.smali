.class public final Lwm;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lp01;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:Lya;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;ILya;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwm;->a:Ljava/lang/CharSequence;

    .line 8
    .line 9
    iput p2, p0, Lwm;->b:I

    .line 10
    .line 11
    iput-object p3, p0, Lwm;->c:Lya;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lvm;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lvm;-><init>(Lwm;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
