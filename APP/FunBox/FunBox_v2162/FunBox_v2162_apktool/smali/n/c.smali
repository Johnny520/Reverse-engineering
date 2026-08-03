.class final Ln/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Ln/c;->a:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Ln/c;->a:I

    return v0
.end method

.method public final b(I)V
    .locals 2

    iget v0, p0, Ln/c;->a:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    iput p1, p0, Ln/c;->a:I

    :cond_0
    return-void
.end method
