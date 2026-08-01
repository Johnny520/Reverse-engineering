.class public Lcom/android/dx/dex/cf/CfOptions;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public dontOptimizeListFile:Ljava/lang/String;

.field public localInfo:Z

.field public optimize:Z

.field public optimizeListFile:Ljava/lang/String;

.field public positionInfo:I

.field public statistics:Z

.field public strictNameCheck:Z

.field public warn:Ljava/io/PrintStream;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput v0, p0, Lcom/android/dx/dex/cf/CfOptions;->positionInfo:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/android/dx/dex/cf/CfOptions;->localInfo:Z

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, p0, Lcom/android/dx/dex/cf/CfOptions;->strictNameCheck:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/android/dx/dex/cf/CfOptions;->optimize:Z

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/android/dx/dex/cf/CfOptions;->optimizeListFile:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/android/dx/dex/cf/CfOptions;->dontOptimizeListFile:Ljava/lang/String;

    .line 19
    .line 20
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/android/dx/dex/cf/CfOptions;->warn:Ljava/io/PrintStream;

    .line 23
    .line 24
    return-void
.end method
