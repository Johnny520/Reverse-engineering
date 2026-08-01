.class public Lorg/apache/commons/compress/PasswordRequiredException;
.super Lorg/apache/commons/compress/CompressException;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
