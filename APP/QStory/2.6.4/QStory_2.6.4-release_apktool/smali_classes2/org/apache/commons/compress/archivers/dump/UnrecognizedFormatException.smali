.class public Lorg/apache/commons/compress/archivers/dump/UnrecognizedFormatException;
.super Lorg/apache/commons/compress/archivers/dump/DumpArchiveException;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "this is not a recognized format."

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lorg/apache/commons/compress/archivers/dump/DumpArchiveException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
