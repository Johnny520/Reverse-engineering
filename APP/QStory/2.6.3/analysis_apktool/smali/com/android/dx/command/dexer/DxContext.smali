.class public Lcom/android/dx/command/dexer/DxContext;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final codeStatistics:Lcom/android/dx/dex/cf/CodeStatistics;

.field public final err:Ljava/io/PrintStream;

.field final noop:Ljava/io/PrintStream;

.field public final optimizerOptions:Lcom/android/dx/dex/cf/OptimizerOptions;

.field public final out:Ljava/io/PrintStream;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 45
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-direct {p0, v0, v1}, Lcom/android/dx/command/dexer/DxContext;-><init>(Ljava/io/OutputStream;Ljava/io/OutputStream;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Ljava/io/OutputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/android/dx/dex/cf/CodeStatistics;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/dex/cf/CodeStatistics;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/command/dexer/DxContext;->codeStatistics:Lcom/android/dx/dex/cf/CodeStatistics;

    .line 10
    .line 11
    new-instance v0, Lcom/android/dx/dex/cf/OptimizerOptions;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/android/dx/dex/cf/OptimizerOptions;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/android/dx/command/dexer/DxContext;->optimizerOptions:Lcom/android/dx/dex/cf/OptimizerOptions;

    .line 17
    .line 18
    new-instance v0, Ljava/io/PrintStream;

    .line 19
    .line 20
    new-instance v1, Lcom/android/dx/command/dexer/DxContext$1;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/android/dx/command/dexer/DxContext$1;-><init>(Lcom/android/dx/command/dexer/DxContext;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/android/dx/command/dexer/DxContext;->noop:Ljava/io/PrintStream;

    .line 29
    .line 30
    new-instance v0, Ljava/io/PrintStream;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 36
    .line 37
    new-instance p1, Ljava/io/PrintStream;

    .line 38
    .line 39
    invoke-direct {p1, p2}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 43
    .line 44
    return-void
.end method
