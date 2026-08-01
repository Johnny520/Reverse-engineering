.class public Lcom/google/flatbuffers/FlexBuffers$Map;
.super Lcom/google/flatbuffers/FlexBuffers$Vector;
.source "FlexBuffers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/FlexBuffers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Map"
.end annotation


# static fields
.field private static final EMPTY_MAP:Lcom/google/flatbuffers/FlexBuffers$Map;


# instance fields
.field private final comparisonBuffer:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 825
    new-instance v0, Lcom/google/flatbuffers/FlexBuffers$Map;

    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers;->access$000()Lcom/google/flatbuffers/ReadBuf;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/google/flatbuffers/FlexBuffers$Map;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    sput-object v0, Lcom/google/flatbuffers/FlexBuffers$Map;->EMPTY_MAP:Lcom/google/flatbuffers/FlexBuffers$Map;

    return-void
.end method

.method constructor <init>(Lcom/google/flatbuffers/ReadBuf;II)V
    .locals 1
    .param p1, "bb"    # Lcom/google/flatbuffers/ReadBuf;
    .param p2, "end"    # I
    .param p3, "byteWidth"    # I

    .line 831
    invoke-direct {p0, p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffers$Vector;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    .line 828
    const/4 v0, 0x4

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->comparisonBuffer:[B

    .line 832
    return-void
.end method

.method private binarySearch(Ljava/lang/CharSequence;)I
    .locals 9
    .param p1, "searchedKey"    # Ljava/lang/CharSequence;

    .line 912
    const/4 v0, 0x0

    .line 913
    .local v0, "low":I
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->size:I

    add-int/lit8 v1, v1, -0x1

    .line 914
    .local v1, "high":I
    const/4 v2, 0x3

    .line 915
    .local v2, "num_prefixed_fields":I
    iget v3, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->end:I

    iget v4, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    mul-int/lit8 v4, v4, 0x3

    sub-int/2addr v3, v4

    .line 916
    .local v3, "keysOffset":I
    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v5, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    invoke-static {v4, v3, v5}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v4

    .line 917
    .local v4, "keysStart":I
    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v6, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    add-int/2addr v6, v3

    iget v7, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    invoke-static {v5, v6, v7}, Lcom/google/flatbuffers/FlexBuffers;->access$100(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v5

    .line 918
    .local v5, "keyByteWidth":I
    :goto_0
    if-gt v0, v1, :cond_2

    .line 919
    add-int v6, v0, v1

    ushr-int/lit8 v6, v6, 0x1

    .line 920
    .local v6, "mid":I
    iget-object v7, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    mul-int v8, v6, v5

    add-int/2addr v8, v4

    invoke-static {v7, v8, v5}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v7

    .line 921
    .local v7, "keyPos":I
    invoke-direct {p0, v7, p1}, Lcom/google/flatbuffers/FlexBuffers$Map;->compareCharSequence(ILjava/lang/CharSequence;)I

    move-result v8

    .line 922
    .local v8, "cmp":I
    if-gez v8, :cond_0

    .line 923
    add-int/lit8 v0, v6, 0x1

    goto :goto_1

    .line 924
    :cond_0
    if-lez v8, :cond_1

    .line 925
    add-int/lit8 v1, v6, -0x1

    .line 928
    .end local v6    # "mid":I
    .end local v7    # "keyPos":I
    .end local v8    # "cmp":I
    :goto_1
    goto :goto_0

    .line 927
    .restart local v6    # "mid":I
    .restart local v7    # "keyPos":I
    .restart local v8    # "cmp":I
    :cond_1
    return v6

    .line 929
    .end local v6    # "mid":I
    .end local v7    # "keyPos":I
    .end local v8    # "cmp":I
    :cond_2
    add-int/lit8 v6, v0, 0x1

    neg-int v6, v6

    return v6
.end method

.method private binarySearch([B)I
    .locals 9
    .param p1, "searchedKey"    # [B

    .line 933
    const/4 v0, 0x0

    .line 934
    .local v0, "low":I
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->size:I

    add-int/lit8 v1, v1, -0x1

    .line 935
    .local v1, "high":I
    const/4 v2, 0x3

    .line 936
    .local v2, "num_prefixed_fields":I
    iget v3, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->end:I

    iget v4, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    mul-int/lit8 v4, v4, 0x3

    sub-int/2addr v3, v4

    .line 937
    .local v3, "keysOffset":I
    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v5, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    invoke-static {v4, v3, v5}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v4

    .line 938
    .local v4, "keysStart":I
    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v6, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    add-int/2addr v6, v3

    iget v7, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    invoke-static {v5, v6, v7}, Lcom/google/flatbuffers/FlexBuffers;->access$100(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v5

    .line 940
    .local v5, "keyByteWidth":I
    :goto_0
    if-gt v0, v1, :cond_2

    .line 941
    add-int v6, v0, v1

    ushr-int/lit8 v6, v6, 0x1

    .line 942
    .local v6, "mid":I
    iget-object v7, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    mul-int v8, v6, v5

    add-int/2addr v8, v4

    invoke-static {v7, v8, v5}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v7

    .line 943
    .local v7, "keyPos":I
    iget-object v8, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-direct {p0, v8, v7, p1}, Lcom/google/flatbuffers/FlexBuffers$Map;->compareBytes(Lcom/google/flatbuffers/ReadBuf;I[B)I

    move-result v8

    .line 944
    .local v8, "cmp":I
    if-gez v8, :cond_0

    .line 945
    add-int/lit8 v0, v6, 0x1

    goto :goto_1

    .line 946
    :cond_0
    if-lez v8, :cond_1

    .line 947
    add-int/lit8 v1, v6, -0x1

    .line 950
    .end local v6    # "mid":I
    .end local v7    # "keyPos":I
    .end local v8    # "cmp":I
    :goto_1
    goto :goto_0

    .line 949
    .restart local v6    # "mid":I
    .restart local v7    # "keyPos":I
    .restart local v8    # "cmp":I
    :cond_1
    return v6

    .line 951
    .end local v6    # "mid":I
    .end local v7    # "keyPos":I
    .end local v8    # "cmp":I
    :cond_2
    add-int/lit8 v6, v0, 0x1

    neg-int v6, v6

    return v6
.end method

.method private compareBytes(Lcom/google/flatbuffers/ReadBuf;I[B)I
    .locals 6
    .param p1, "bb"    # Lcom/google/flatbuffers/ReadBuf;
    .param p2, "start"    # I
    .param p3, "other"    # [B

    .line 956
    move v0, p2

    .line 957
    .local v0, "l1":I
    const/4 v1, 0x0

    .line 960
    .local v1, "l2":I
    :cond_0
    invoke-interface {p1, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v2

    .line 961
    .local v2, "c1":B
    aget-byte v3, p3, v1

    .line 962
    .local v3, "c2":B
    if-nez v2, :cond_1

    .line 963
    sub-int v4, v2, v3

    return v4

    .line 964
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 965
    add-int/lit8 v1, v1, 0x1

    .line 966
    array-length v4, p3

    if-ne v1, v4, :cond_4

    .line 969
    sub-int v4, v2, v3

    .line 970
    .local v4, "cmp":I
    if-nez v4, :cond_3

    invoke-interface {p1, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    .line 973
    :cond_2
    const/4 v5, 0x1

    return v5

    .line 971
    :cond_3
    :goto_0
    return v4

    .line 977
    .end local v4    # "cmp":I
    :cond_4
    if-eq v2, v3, :cond_0

    .line 978
    sub-int v4, v2, v3

    return v4
.end method

.method private compareCharSequence(ILjava/lang/CharSequence;)I
    .locals 9
    .param p1, "start"    # I
    .param p2, "other"    # Ljava/lang/CharSequence;

    .line 983
    move v0, p1

    .line 984
    .local v0, "bufferPos":I
    const/4 v1, 0x0

    .line 985
    .local v1, "otherPos":I
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {v2}, Lcom/google/flatbuffers/ReadBuf;->limit()I

    move-result v2

    .line 986
    .local v2, "limit":I
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    .line 991
    .local v3, "otherLimit":I
    :goto_0
    if-ge v1, v3, :cond_4

    .line 992
    invoke-interface {p2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 994
    .local v4, "c2":C
    const/16 v5, 0x80

    if-lt v4, v5, :cond_0

    .line 996
    goto :goto_1

    .line 999
    :cond_0
    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {v5, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v5

    .line 1001
    .local v5, "b":B
    if-nez v5, :cond_1

    .line 1002
    neg-int v6, v4

    return v6

    .line 1003
    :cond_1
    if-gez v5, :cond_2

    .line 1004
    goto :goto_1

    .line 1005
    :cond_2
    int-to-char v6, v5

    if-eq v6, v4, :cond_3

    .line 1006
    sub-int v6, v5, v4

    return v6

    .line 1008
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 1009
    nop

    .end local v4    # "c2":C
    .end local v5    # "b":B
    add-int/lit8 v1, v1, 0x1

    .line 1010
    goto :goto_0

    .line 1012
    :cond_4
    :goto_1
    if-ge v0, v2, :cond_a

    .line 1014
    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->comparisonBuffer:[B

    invoke-static {p2, v1, v4}, Lcom/google/flatbuffers/Utf8;->encodeUtf8CodePoint(Ljava/lang/CharSequence;I[B)I

    move-result v4

    .line 1016
    .local v4, "sizeInBuff":I
    if-nez v4, :cond_5

    .line 1019
    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {v5, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v5

    return v5

    .line 1022
    :cond_5
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_2
    if-ge v5, v4, :cond_8

    .line 1023
    iget-object v6, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    add-int/lit8 v7, v0, 0x1

    .end local v0    # "bufferPos":I
    .local v7, "bufferPos":I
    invoke-interface {v6, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v0

    .line 1024
    .local v0, "bufferByte":B
    iget-object v6, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->comparisonBuffer:[B

    aget-byte v6, v6, v5

    .line 1025
    .local v6, "otherByte":B
    if-nez v0, :cond_6

    .line 1027
    neg-int v8, v6

    return v8

    .line 1028
    :cond_6
    if-eq v0, v6, :cond_7

    .line 1029
    sub-int v8, v0, v6

    return v8

    .line 1022
    .end local v0    # "bufferByte":B
    .end local v6    # "otherByte":B
    :cond_7
    add-int/lit8 v5, v5, 0x1

    move v0, v7

    goto :goto_2

    .line 1033
    .end local v5    # "i":I
    .end local v7    # "bufferPos":I
    .local v0, "bufferPos":I
    :cond_8
    const/4 v5, 0x4

    if-ne v4, v5, :cond_9

    const/4 v5, 0x2

    goto :goto_3

    :cond_9
    const/4 v5, 0x1

    :goto_3
    add-int/2addr v1, v5

    .line 1034
    .end local v4    # "sizeInBuff":I
    goto :goto_1

    .line 1035
    :cond_a
    const/4 v4, 0x0

    return v4
.end method

.method public static empty()Lcom/google/flatbuffers/FlexBuffers$Map;
    .locals 1

    .line 839
    sget-object v0, Lcom/google/flatbuffers/FlexBuffers$Map;->EMPTY_MAP:Lcom/google/flatbuffers/FlexBuffers$Map;

    return-object v0
.end method


# virtual methods
.method public get(Ljava/lang/String;)Lcom/google/flatbuffers/FlexBuffers$Reference;
    .locals 2
    .param p1, "key"    # Ljava/lang/String;

    .line 847
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffers$Map;->binarySearch(Ljava/lang/CharSequence;)I

    move-result v0

    .line 848
    .local v0, "index":I
    if-ltz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->size:I

    if-ge v0, v1, :cond_0

    .line 849
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlexBuffers$Map;->get(I)Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object v1

    return-object v1

    .line 851
    :cond_0
    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers$Reference;->access$600()Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object v1

    return-object v1
.end method

.method public get([B)Lcom/google/flatbuffers/FlexBuffers$Reference;
    .locals 2
    .param p1, "key"    # [B

    .line 859
    invoke-direct {p0, p1}, Lcom/google/flatbuffers/FlexBuffers$Map;->binarySearch([B)I

    move-result v0

    .line 860
    .local v0, "index":I
    if-ltz v0, :cond_0

    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->size:I

    if-ge v0, v1, :cond_0

    .line 861
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/FlexBuffers$Map;->get(I)Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object v1

    return-object v1

    .line 863
    :cond_0
    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers$Reference;->access$600()Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object v1

    return-object v1
.end method

.method public keys()Lcom/google/flatbuffers/FlexBuffers$KeyVector;
    .locals 9

    .line 872
    const/4 v0, 0x3

    .line 873
    .local v0, "num_prefixed_fields":I
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->end:I

    iget v2, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    mul-int/lit8 v2, v2, 0x3

    sub-int/2addr v1, v2

    .line 874
    .local v1, "keysOffset":I
    new-instance v2, Lcom/google/flatbuffers/FlexBuffers$KeyVector;

    new-instance v3, Lcom/google/flatbuffers/FlexBuffers$TypedVector;

    iget-object v4, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget-object v5, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v6, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    .line 875
    invoke-static {v5, v1, v6}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v5

    iget-object v6, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v7, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    add-int/2addr v7, v1

    iget v8, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    .line 876
    invoke-static {v6, v7, v8}, Lcom/google/flatbuffers/FlexBuffers;->access$100(Lcom/google/flatbuffers/ReadBuf;II)I

    move-result v6

    const/4 v7, 0x4

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/flatbuffers/FlexBuffers$TypedVector;-><init>(Lcom/google/flatbuffers/ReadBuf;III)V

    invoke-direct {v2, v3}, Lcom/google/flatbuffers/FlexBuffers$KeyVector;-><init>(Lcom/google/flatbuffers/FlexBuffers$TypedVector;)V

    .line 874
    return-object v2
.end method

.method public toString(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 6
    .param p1, "builder"    # Ljava/lang/StringBuilder;

    .line 894
    const-string v0, "{ "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 895
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$Map;->keys()Lcom/google/flatbuffers/FlexBuffers$KeyVector;

    move-result-object v0

    .line 896
    .local v0, "keys":Lcom/google/flatbuffers/FlexBuffers$KeyVector;
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$Map;->size()I

    move-result v1

    .line 897
    .local v1, "size":I
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$Map;->values()Lcom/google/flatbuffers/FlexBuffers$Vector;

    move-result-object v2

    .line 898
    .local v2, "vals":Lcom/google/flatbuffers/FlexBuffers$Vector;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    if-ge v3, v1, :cond_1

    .line 899
    const/16 v4, 0x22

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 900
    invoke-virtual {v0, v3}, Lcom/google/flatbuffers/FlexBuffers$KeyVector;->get(I)Lcom/google/flatbuffers/FlexBuffers$Key;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/flatbuffers/FlexBuffers$Key;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 901
    const-string v5, "\" : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 902
    invoke-virtual {v2, v3}, Lcom/google/flatbuffers/FlexBuffers$Vector;->get(I)Lcom/google/flatbuffers/FlexBuffers$Reference;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/flatbuffers/FlexBuffers$Reference;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 903
    add-int/lit8 v4, v1, -0x1

    if-eq v3, v4, :cond_0

    .line 904
    const-string v4, ", "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 898
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 906
    .end local v3    # "i":I
    :cond_1
    const-string v3, " }"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 907
    return-object p1
.end method

.method public values()Lcom/google/flatbuffers/FlexBuffers$Vector;
    .locals 4

    .line 884
    new-instance v0, Lcom/google/flatbuffers/FlexBuffers$Vector;

    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->bb:Lcom/google/flatbuffers/ReadBuf;

    iget v2, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->end:I

    iget v3, p0, Lcom/google/flatbuffers/FlexBuffers$Map;->byteWidth:I

    invoke-direct {v0, v1, v2, v3}, Lcom/google/flatbuffers/FlexBuffers$Vector;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    return-object v0
.end method
