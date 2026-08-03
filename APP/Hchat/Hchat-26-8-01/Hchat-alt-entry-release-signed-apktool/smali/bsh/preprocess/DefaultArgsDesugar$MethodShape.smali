.class final Lbsh/preprocess/DefaultArgsDesugar$MethodShape;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/preprocess/DefaultArgsDesugar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MethodShape"
.end annotation


# instance fields
.field final declEndExclusive:I

.field final declStart:I

.field final methodName:Ljava/lang/String;

.field final parsed:Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;


# direct methods
.method public constructor <init>(IILjava/lang/String;Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;->declStart:I

    .line 5
    .line 6
    iput p2, p0, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;->declEndExclusive:I

    .line 7
    .line 8
    iput-object p3, p0, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;->methodName:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;->parsed:Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;

    .line 11
    .line 12
    return-void
.end method
