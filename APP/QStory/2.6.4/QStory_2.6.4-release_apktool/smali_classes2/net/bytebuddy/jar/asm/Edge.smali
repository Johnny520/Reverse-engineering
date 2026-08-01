.class final Lnet/bytebuddy/jar/asm/Edge;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field static final EXCEPTION:I = 0x7fffffff

.field static final JUMP:I


# instance fields
.field final info:I

.field nextEdge:Lnet/bytebuddy/jar/asm/Edge;

.field final successor:Lnet/bytebuddy/jar/asm/Label;


# direct methods
.method public constructor <init>(ILnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Edge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/jar/asm/Edge;->info:I

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/Edge;->successor:Lnet/bytebuddy/jar/asm/Label;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/Edge;->nextEdge:Lnet/bytebuddy/jar/asm/Edge;

    .line 9
    .line 10
    return-void
.end method
