.class public final Lcom/google/flatbuffers/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:Ljava/nio/ByteBuffer;

.field public final synthetic b:Lcom/google/flatbuffers/d;


# direct methods
.method public constructor <init>(Lcom/google/flatbuffers/d;Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/flatbuffers/c;->b:Lcom/google/flatbuffers/d;

    iput-object p2, p0, Lcom/google/flatbuffers/c;->a:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    iget-object v0, p0, Lcom/google/flatbuffers/c;->b:Lcom/google/flatbuffers/d;

    iget-object v1, p0, Lcom/google/flatbuffers/c;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/flatbuffers/d;->keysCompare(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method
