.class public final La/A$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# static fields
.field public static final c:La/A$h;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:La/A$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/A$h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/A$h;->c:La/A$h;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, La/A;->f:La/A$a;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, La/A$a;->e(La/A$h;Ljava/lang/Thread;)V

    return-void
.end method
