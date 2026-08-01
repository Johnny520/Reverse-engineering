.class public abstract Led1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ldd1;


# static fields
.field public static final a:Lgp0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsr0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lsr0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Led1;->a:Lgp0;

    .line 12
    .line 13
    return-void
.end method
