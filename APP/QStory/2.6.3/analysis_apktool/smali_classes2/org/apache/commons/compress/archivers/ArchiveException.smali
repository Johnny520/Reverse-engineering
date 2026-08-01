.class public Lorg/apache/commons/compress/archivers/ArchiveException;
.super Lorg/apache/commons/compress/CompressException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final serialVersionUID:J = 0x267a938239b6b01cL


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/compress/CompressException;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lorg/apache/commons/compress/CompressException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/compress/CompressException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/compress/CompressException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lorg/apache/commons/compress/CompressException;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static requireNonNull(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/util/function/Supplier<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    const-class v0, Lorg/apache/commons/compress/archivers/ArchiveException;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lorg/apache/commons/compress/CompressException;->requireNonNull(Ljava/lang/Class;Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
