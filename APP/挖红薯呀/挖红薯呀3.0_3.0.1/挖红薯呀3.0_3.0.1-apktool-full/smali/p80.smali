.class public final Lp80;
.super Lu50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lx80;


# instance fields
.field public final a:Lu5;


# direct methods
.method public constructor <init>(Lsw;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lu5;

    .line 5
    .line 6
    invoke-direct {v0}, Lu5;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp80;->a:Lu5;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final l()Lu5;
    .locals 0

    .line 1
    iget-object p0, p0, Lp80;->a:Lu5;

    .line 2
    .line 3
    return-object p0
.end method
