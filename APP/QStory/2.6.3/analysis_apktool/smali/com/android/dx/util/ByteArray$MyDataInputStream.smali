.class public Lcom/android/dx/util/ByteArray$MyDataInputStream;
.super Ljava/io/DataInputStream;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
