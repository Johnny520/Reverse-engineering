.class final Lbsh/org/objectweb/asm/Edge;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final EXCEPTION:I = 0x7fffffff

.field static final JUMP:I


# instance fields
.field final info:I

.field nextEdge:Lbsh/org/objectweb/asm/Edge;

.field final successor:Lbsh/org/objectweb/asm/Label;


# direct methods
.method public constructor <init>(ILbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Edge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lbsh/org/objectweb/asm/Edge;->info:I

    .line 5
    .line 6
    iput-object p2, p0, Lbsh/org/objectweb/asm/Edge;->successor:Lbsh/org/objectweb/asm/Label;

    .line 7
    .line 8
    iput-object p3, p0, Lbsh/org/objectweb/asm/Edge;->nextEdge:Lbsh/org/objectweb/asm/Edge;

    .line 9
    .line 10
    return-void
.end method
