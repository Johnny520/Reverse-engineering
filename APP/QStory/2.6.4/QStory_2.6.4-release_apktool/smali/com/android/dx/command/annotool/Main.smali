.class public Lcom/android/dx/command/annotool/Main;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/command/annotool/Main$Arguments;,
        Lcom/android/dx/command/annotool/Main$InvalidArgumentException;,
        Lcom/android/dx/command/annotool/Main$PrintType;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/command/annotool/Main$Arguments;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/command/annotool/Main$Arguments;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0, p0}, Lcom/android/dx/command/annotool/Main$Arguments;->parse([Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/android/dx/command/annotool/Main$InvalidArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    new-instance p0, Lcom/android/dx/command/annotool/AnnotationLister;

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/android/dx/command/annotool/AnnotationLister;-><init>(Lcom/android/dx/command/annotool/Main$Arguments;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/android/dx/command/annotool/AnnotationLister;->process()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception p0

    .line 19
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string p0, "usage"

    .line 29
    .line 30
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
