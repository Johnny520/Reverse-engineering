.class public interface abstract Lbsh/ParserTreeConstants;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final JJTALLOCATIONEXPRESSION:I = 0x1c

.field public static final JJTAMBIGUOUSNAME:I = 0xe

.field public static final JJTARGUMENTS:I = 0x1b

.field public static final JJTARRAYDIMENSIONS:I = 0x1d

.field public static final JJTARRAYINITIALIZER:I = 0x8

.field public static final JJTASSIGNMENT:I = 0xf

.field public static final JJTAUTOCLOSEABLE:I = 0x2c

.field public static final JJTBINARYEXPRESSION:I = 0x11

.field public static final JJTBLOCK:I = 0x3

.field public static final JJTCASTEXPRESSION:I = 0x13

.field public static final JJTCLASSDECLARATION:I = 0x1

.field public static final JJTENHANCEDFORSTATEMENT:I = 0x24

.field public static final JJTENUMCONSTANT:I = 0x2

.field public static final JJTFORMALPARAMETER:I = 0xa

.field public static final JJTFORMALPARAMETERS:I = 0x9

.field public static final JJTFORSTATEMENT:I = 0x23

.field public static final JJTIFSTATEMENT:I = 0x21

.field public static final JJTIMPORTDECLARATION:I = 0x6

.field public static final JJTLABELEDSTATEMENT:I = 0x1e

.field public static final JJTLAMBDAEXPRESSION:I = 0x16

.field public static final JJTLITERAL:I = 0x1a

.field public static final JJTMETHODDECLARATION:I = 0x4

.field public static final JJTMETHODINVOCATION:I = 0x15

.field public static final JJTMULTICATCH:I = 0x2a

.field public static final JJTPACKAGEDECLARATION:I = 0x5

.field public static final JJTPRIMARYEXPRESSION:I = 0x14

.field public static final JJTPRIMARYSUFFIX:I = 0x19

.field public static final JJTPRIMITIVETYPE:I = 0xd

.field public static final JJTRETURNSTATEMENT:I = 0x27

.field public static final JJTRETURNTYPE:I = 0xc

.field public static final JJTSTATEMENTEXPRESSIONLIST:I = 0x26

.field public static final JJTSWITCHLABEL:I = 0x20

.field public static final JJTSWITCHSTATEMENT:I = 0x1f

.field public static final JJTTERNARYEXPRESSION:I = 0x10

.field public static final JJTTHROWSTATEMENT:I = 0x28

.field public static final JJTTRYSTATEMENT:I = 0x29

.field public static final JJTTRYWITHRESOURCES:I = 0x2b

.field public static final JJTTYPE:I = 0xb

.field public static final JJTTYPEDVARIABLEDECLARATION:I = 0x25

.field public static final JJTUNARYEXPRESSION:I = 0x12

.field public static final JJTVARIABLEDECLARATOR:I = 0x7

.field public static final JJTVOID:I = 0x0

.field public static final JJTWHENENTRY:I = 0x18

.field public static final JJTWHENEXPRESSION:I = 0x17

.field public static final JJTWHILESTATEMENT:I = 0x22

.field public static final jjtNodeName:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 46

    .line 1
    const-string v44, "TryWithResources"

    .line 2
    .line 3
    const-string v45, "AutoCloseable"

    .line 4
    .line 5
    const-string v1, "void"

    .line 6
    .line 7
    const-string v2, "ClassDeclaration"

    .line 8
    .line 9
    const-string v3, "EnumConstant"

    .line 10
    .line 11
    const-string v4, "Block"

    .line 12
    .line 13
    const-string v5, "MethodDeclaration"

    .line 14
    .line 15
    const-string v6, "PackageDeclaration"

    .line 16
    .line 17
    const-string v7, "ImportDeclaration"

    .line 18
    .line 19
    const-string v8, "VariableDeclarator"

    .line 20
    .line 21
    const-string v9, "ArrayInitializer"

    .line 22
    .line 23
    const-string v10, "FormalParameters"

    .line 24
    .line 25
    const-string v11, "FormalParameter"

    .line 26
    .line 27
    const-string v12, "Type"

    .line 28
    .line 29
    const-string v13, "ReturnType"

    .line 30
    .line 31
    const-string v14, "PrimitiveType"

    .line 32
    .line 33
    const-string v15, "AmbiguousName"

    .line 34
    .line 35
    const-string v16, "Assignment"

    .line 36
    .line 37
    const-string v17, "TernaryExpression"

    .line 38
    .line 39
    const-string v18, "BinaryExpression"

    .line 40
    .line 41
    const-string v19, "UnaryExpression"

    .line 42
    .line 43
    const-string v20, "CastExpression"

    .line 44
    .line 45
    const-string v21, "PrimaryExpression"

    .line 46
    .line 47
    const-string v22, "MethodInvocation"

    .line 48
    .line 49
    const-string v23, "LambdaExpression"

    .line 50
    .line 51
    const-string v24, "WhenExpression"

    .line 52
    .line 53
    const-string v25, "WhenEntry"

    .line 54
    .line 55
    const-string v26, "PrimarySuffix"

    .line 56
    .line 57
    const-string v27, "Literal"

    .line 58
    .line 59
    const-string v28, "Arguments"

    .line 60
    .line 61
    const-string v29, "AllocationExpression"

    .line 62
    .line 63
    const-string v30, "ArrayDimensions"

    .line 64
    .line 65
    const-string v31, "LabeledStatement"

    .line 66
    .line 67
    const-string v32, "SwitchStatement"

    .line 68
    .line 69
    const-string v33, "SwitchLabel"

    .line 70
    .line 71
    const-string v34, "IfStatement"

    .line 72
    .line 73
    const-string v35, "WhileStatement"

    .line 74
    .line 75
    const-string v36, "ForStatement"

    .line 76
    .line 77
    const-string v37, "EnhancedForStatement"

    .line 78
    .line 79
    const-string v38, "TypedVariableDeclaration"

    .line 80
    .line 81
    const-string v39, "StatementExpressionList"

    .line 82
    .line 83
    const-string v40, "ReturnStatement"

    .line 84
    .line 85
    const-string v41, "ThrowStatement"

    .line 86
    .line 87
    const-string v42, "TryStatement"

    .line 88
    .line 89
    const-string v43, "MultiCatch"

    .line 90
    .line 91
    filled-new-array/range {v1 .. v45}, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lbsh/ParserTreeConstants;->jjtNodeName:[Ljava/lang/String;

    .line 96
    .line 97
    return-void
.end method
