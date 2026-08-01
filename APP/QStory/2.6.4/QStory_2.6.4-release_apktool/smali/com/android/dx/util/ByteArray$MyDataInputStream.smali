.class public Lcom/android/dx/util/ByteArray$MyDataInputStream;
.super Ljava/io/DataInputStream;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/util/ByteArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MyDataInputStream"
.end annotation


# instance fields
.field private final wrapped:Lcom/android/dx/util/ByteArray$MyInputStream;


# direct methods
.method public constructor <init>(Lcom/android/dx/util/ByteArray$MyInputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/util/ByteArray$MyDataInputStream;->wrapped:Lcom/android/dx/util/ByteArray$MyInputStream;

    .line 5
    .line 6
    return-void
.end method
