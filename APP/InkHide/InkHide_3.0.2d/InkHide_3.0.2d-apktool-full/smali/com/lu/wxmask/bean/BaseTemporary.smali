.class public Lcom/lu/wxmask/bean/BaseTemporary;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lc/a;
.end annotation


# instance fields
.field private mode:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/lu/wxmask/bean/BaseTemporary;->mode:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/bean/BaseTemporary;->mode:I

    .line 2
    .line 3
    return v0
.end method

.method public final setMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/bean/BaseTemporary;->mode:I

    .line 2
    .line 3
    return-void
.end method
