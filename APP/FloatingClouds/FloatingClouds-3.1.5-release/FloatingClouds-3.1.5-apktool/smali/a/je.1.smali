.class public final La/je;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/je$b;
    }
.end annotation


# static fields
.field public static b:La/je;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/je;->a:Ljava/lang/Object;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, La/je$a;

    invoke-direct {v2, p0}, La/je$a;-><init>(La/je;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    return-void
.end method

.method public static a()La/je;
    .locals 1

    sget-object v0, La/je;->b:La/je;

    if-nez v0, :cond_0

    new-instance v0, La/je;

    invoke-direct {v0}, La/je;-><init>()V

    sput-object v0, La/je;->b:La/je;

    :cond_0
    sget-object v0, La/je;->b:La/je;

    return-object v0
.end method
