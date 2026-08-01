.class Lcom/android/dx/merge/InstructionTransformer$GenericVisitor;
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
    name = "GenericVisitor"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/merge/InstructionTransformer;


# direct methods
.method private constructor <init>(Lcom/android/dx/merge/InstructionTransformer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/InstructionTransformer$GenericVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

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
    invoke-direct {p0, p1}, Lcom/android/dx/merge/InstructionTransformer$GenericVisitor;-><init>(Lcom/android/dx/merge/InstructionTransformer;)V

    return-void
.end method


# virtual methods
.method public visit([Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/DecodedInstruction;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/android/dx/merge/InstructionTransformer$GenericVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/android/dx/merge/InstructionTransformer;->access$700(Lcom/android/dx/merge/InstructionTransformer;)[Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Lcom/android/dx/merge/InstructionTransformer$GenericVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    .line 8
    .line 9
    invoke-static {p0}, Lcom/android/dx/merge/InstructionTransformer;->access$808(Lcom/android/dx/merge/InstructionTransformer;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    aput-object p2, p1, p0

    .line 14
    .line 15
    return-void
.end method
