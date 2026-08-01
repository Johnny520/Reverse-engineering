.class public Lcom/android/dx/util/ByteArray$MyInputStream;
.super Ljava/io/InputStream;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/util/ByteArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MyInputStream"
.end annotation


# instance fields
.field private cursor:I

.field private mark:I

.field final synthetic this$0:Lcom/android/dx/util/ByteArray;


# direct methods
.method public constructor <init>(Lcom/android/dx/util/ByteArray;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->this$0:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    .line 8
    .line 9
    iput p1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->mark:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public available()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->this$0:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/util/ByteArray;->access$000(Lcom/android/dx/util/ByteArray;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    .line 8
    .line 9
    sub-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public mark(I)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    .line 2
    .line 3
    iput p1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->mark:I

    .line 4
    .line 5
    return-void
.end method

.method public markSupported()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public read()I
    .locals 2

    .line 44
    iget v0, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    iget-object v1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->this$0:Lcom/android/dx/util/ByteArray;

    invoke-static {v1}, Lcom/android/dx/util/ByteArray;->access$000(Lcom/android/dx/util/ByteArray;)I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 p0, -0x1

    return p0

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->this$0:Lcom/android/dx/util/ByteArray;

    iget v1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    invoke-static {v0, v1}, Lcom/android/dx/util/ByteArray;->access$100(Lcom/android/dx/util/ByteArray;I)I

    move-result v0

    .line 46
    iget v1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    return v0
.end method

.method public read([BII)I
    .locals 3

    .line 1
    add-int v0, p2, p3

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    array-length p3, p1

    .line 7
    sub-int/2addr p3, p2

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->this$0:Lcom/android/dx/util/ByteArray;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/android/dx/util/ByteArray;->access$000(Lcom/android/dx/util/ByteArray;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    .line 15
    .line 16
    sub-int/2addr v0, v1

    .line 17
    if-le p3, v0, :cond_1

    .line 18
    .line 19
    move p3, v0

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->this$0:Lcom/android/dx/util/ByteArray;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/android/dx/util/ByteArray;->access$200(Lcom/android/dx/util/ByteArray;)[B

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget v1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    .line 27
    .line 28
    iget-object v2, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->this$0:Lcom/android/dx/util/ByteArray;

    .line 29
    .line 30
    invoke-static {v2}, Lcom/android/dx/util/ByteArray;->access$300(Lcom/android/dx/util/ByteArray;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v1

    .line 35
    invoke-static {v0, v2, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    iget p1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    .line 39
    .line 40
    add-int/2addr p1, p3

    .line 41
    iput p1, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    .line 42
    .line 43
    return p3
.end method

.method public reset()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->mark:I

    .line 2
    .line 3
    iput v0, p0, Lcom/android/dx/util/ByteArray$MyInputStream;->cursor:I

    .line 4
    .line 5
    return-void
.end method
