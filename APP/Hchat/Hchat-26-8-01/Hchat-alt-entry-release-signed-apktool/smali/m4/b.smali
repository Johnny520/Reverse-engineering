.class public final Lm4/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lo4/b;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lo4/b;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, p0, Lm4/b;->a:Lo4/b;

    .line 14
    .line 15
    new-instance v2, Ljava/io/PrintStream;

    .line 16
    .line 17
    new-instance v3, Lm4/a;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/io/OutputStream;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, v3}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Ljava/io/PrintStream;

    .line 26
    .line 27
    invoke-direct {v2, v0}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Ljava/io/PrintStream;

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
