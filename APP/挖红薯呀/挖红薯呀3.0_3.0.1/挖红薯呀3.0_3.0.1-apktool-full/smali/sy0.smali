.class public final Lsy0;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lh91;


# static fields
.field public static final s:Ljo0;


# instance fields
.field public r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljo0;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljo0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lsy0;->s:Ljo0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final k()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lsy0;->s:Ljo0;

    .line 2
    .line 3
    return-object p0
.end method
