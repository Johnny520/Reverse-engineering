.class public LYue/ۥۣۢ۠ۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۢ۠ۧ;->ۥۣ۟۟۠([ILjava/nio/ByteBuffer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/nio/ByteBuffer;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۢ۠ۧ;


# direct methods
.method public constructor <init>(LYue/ۥۣۢ۠ۧ;Ljava/nio/ByteBuffer;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣۢ۠ۧ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۢ۠ۧ;

    iput-object p2, p0, LYue/ۥۣۢ۠ۧ$ۥ;->ۥۣ۟۟۠:Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢ۠ۧ$ۥ;->ۥ(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result p1

    return p1
.end method

.method public ۥ(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢ۠ۧ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۢ۠ۧ;

    iget-object v1, p0, LYue/ۥۣۢ۠ۧ$ۥ;->ۥۣ۟۟۠:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2, v1}, LYue/ۥۣۢ۠ۧ;->ۥ۟۟۠ۢ(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method
