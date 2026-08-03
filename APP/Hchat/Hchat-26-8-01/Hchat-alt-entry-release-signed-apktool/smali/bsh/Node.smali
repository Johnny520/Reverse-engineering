.class public interface abstract Lbsh/Node;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator<",
        "Lbsh/Node;",
        ">;"
    }
.end annotation


# static fields
.field public static final JAVACODE:Lbsh/Node;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbsh/Node$1;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-direct {v0, v1}, Lbsh/Node$1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lbsh/Node;->JAVACODE:Lbsh/Node;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public abstract dump(Ljava/lang/String;)V
.end method

.method public abstract eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
.end method

.method public abstract getId()I
.end method

.method public abstract getLineNumber()I
.end method

.method public abstract getSourceFile()Ljava/lang/String;
.end method

.method public abstract getText()Ljava/lang/String;
.end method

.method public abstract jjtAddChild(Lbsh/Node;I)V
.end method

.method public abstract jjtClose()V
.end method

.method public abstract jjtGetChild(I)Lbsh/Node;
.end method

.method public abstract jjtGetChildren()[Lbsh/Node;
.end method

.method public abstract jjtGetNumChildren()I
.end method

.method public abstract jjtGetParent()Lbsh/Node;
.end method

.method public abstract jjtOpen()V
.end method

.method public abstract jjtSetParent(Lbsh/Node;)V
.end method

.method public abstract setSourceFile(Ljava/lang/String;)V
.end method

.method public abstract toString(Ljava/lang/String;)Ljava/lang/String;
.end method
