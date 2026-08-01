.class abstract Lcom/google/flatbuffers/FlexBuffers$Sized;
.super Lcom/google/flatbuffers/FlexBuffers$Object;
.source "FlexBuffers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/FlexBuffers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "Sized"
.end annotation


# instance fields
.field protected final size:I


# direct methods
.method constructor <init>(Lcom/google/flatbuffers/ReadBuf;II)V
    .locals 2
    .param p1, "buff"    # Lcom/google/flatbuffers/ReadBuf;
    .param p2, "end"    # I
    .param p3, "byteWidth"    # I

    .line 657
    invoke-direct {p0, p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffers$Object;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    .line 658
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffers$Sized;->bb:Lcom/google/flatbuffers/ReadBuf;

    sub-int v1, p2, p3

    invoke-static {v0, v1, p3}, Lcom/google/flatbuffers/FlexBuffers;->access$300(Lcom/google/flatbuffers/ReadBuf;II)J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lcom/google/flatbuffers/FlexBuffers$Sized;->size:I

    .line 659
    return-void
.end method


# virtual methods
.method public size()I
    .locals 1

    .line 662
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Sized;->size:I

    return v0
.end method
