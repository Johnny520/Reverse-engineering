.class public Lorg/apache/commons/compress/PasswordRequiredException;
.super Lorg/apache/commons/compress/CompressException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final serialVersionUID:J = 0x134e12ccbf085483L


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "Cannot read encrypted content from "

    .line 2
    .line 3
    const-string v1, " without a password."

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Lorg/apache/commons/compress/CompressException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
