.class Lcom/android/dx/merge/InstructionTransformer$MethodAndProtoVisitor;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/io/CodeReader$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/merge/InstructionTransformer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MethodAndProtoVisitor"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/merge/InstructionTransformer;


# direct methods
.method private constructor <init>(Lcom/android/dx/merge/InstructionTransformer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/InstructionTransformer$MethodAndProtoVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/merge/InstructionTransformer;Lcom/android/dx/merge/InstructionTransformer$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/android/dx/merge/InstructionTransformer$MethodAndProtoVisitor;-><init>(Lcom/android/dx/merge/InstructionTransformer;)V

    return-void
.end method


# virtual methods
.method public visit([Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/DecodedInstruction;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/android/dx/io/instructions/DecodedInstruction;->getIndex()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p2}, Lcom/android/dx/io/instructions/DecodedInstruction;->getProtoIndex()S

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/android/dx/merge/InstructionTransformer$MethodAndProtoVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/android/dx/merge/InstructionTransformer;->access$700(Lcom/android/dx/merge/InstructionTransformer;)[Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lcom/android/dx/merge/InstructionTransformer$MethodAndProtoVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    .line 16
    .line 17
    invoke-static {v2}, Lcom/android/dx/merge/InstructionTransformer;->access$808(Lcom/android/dx/merge/InstructionTransformer;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p0, Lcom/android/dx/merge/InstructionTransformer$MethodAndProtoVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    .line 22
    .line 23
    invoke-static {v3}, Lcom/android/dx/merge/InstructionTransformer;->access$900(Lcom/android/dx/merge/InstructionTransformer;)Lcom/android/dx/merge/IndexMap;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3, p1}, Lcom/android/dx/merge/IndexMap;->adjustMethod(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-object p0, p0, Lcom/android/dx/merge/InstructionTransformer$MethodAndProtoVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    .line 32
    .line 33
    invoke-static {p0}, Lcom/android/dx/merge/InstructionTransformer;->access$900(Lcom/android/dx/merge/InstructionTransformer;)Lcom/android/dx/merge/IndexMap;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/IndexMap;->adjustProto(I)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-virtual {p2, p1, p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->withProtoIndex(II)Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    aput-object p0, v1, v2

    .line 46
    .line 47
    return-void
.end method
