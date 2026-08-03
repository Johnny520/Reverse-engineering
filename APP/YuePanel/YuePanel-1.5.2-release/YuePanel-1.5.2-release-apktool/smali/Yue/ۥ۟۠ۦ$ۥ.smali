.class public LYue/ۥ۟۠ۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۠ۦ;->ۥ()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "[I>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟۠ۦ;


# direct methods
.method public constructor <init>(LYue/ۥ۟۠ۦ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟۠ۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۦ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [I

    check-cast p2, [I

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟۠ۦ$ۥ;->ۥ([I[I)I

    move-result p1

    return p1
.end method

.method public ۥ([I[I)I
    .locals 1

    const/4 v0, 0x0

    aget p1, p1, v0

    aget p2, p2, v0

    sub-int/2addr p1, p2

    return p1
.end method
