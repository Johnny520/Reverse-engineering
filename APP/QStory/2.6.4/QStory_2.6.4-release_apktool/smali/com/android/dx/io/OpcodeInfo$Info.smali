.class public Lcom/android/dx/io/OpcodeInfo$Info;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/io/OpcodeInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Info"
.end annotation


# instance fields
.field private final format:Lcom/android/dx/io/instructions/InstructionCodec;

.field private final indexType:Lcom/android/dx/io/IndexType;

.field private final name:Ljava/lang/String;

.field private final opcode:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/android/dx/io/instructions/InstructionCodec;Lcom/android/dx/io/IndexType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/io/OpcodeInfo$Info;->opcode:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/io/OpcodeInfo$Info;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/dx/io/OpcodeInfo$Info;->format:Lcom/android/dx/io/instructions/InstructionCodec;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/android/dx/io/OpcodeInfo$Info;->indexType:Lcom/android/dx/io/IndexType;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public getFormat()Lcom/android/dx/io/instructions/InstructionCodec;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/OpcodeInfo$Info;->format:Lcom/android/dx/io/instructions/InstructionCodec;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIndexType()Lcom/android/dx/io/IndexType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/OpcodeInfo$Info;->indexType:Lcom/android/dx/io/IndexType;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/OpcodeInfo$Info;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOpcode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/OpcodeInfo$Info;->opcode:I

    .line 2
    .line 3
    return p0
.end method
