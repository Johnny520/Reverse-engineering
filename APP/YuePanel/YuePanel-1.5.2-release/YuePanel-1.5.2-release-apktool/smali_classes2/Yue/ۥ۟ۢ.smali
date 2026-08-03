.class public LYue/ۥ۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nArraysJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,61:1\n26#2:62\n*S KotlinDebug\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n18#1:62\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nArraysJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,61:1\n26#2:62\n*S KotlinDebug\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n18#1:62\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ۥ([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 1
    .param p0    # [Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;I)[TT;"
        }
    .end annotation

    const-string v0, "reference"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, [Ljava/lang/Object;

    return-object p0
.end method

.method public static final ۥ۟([Ljava/lang/Object;)I
    .locals 0
    .param p0    # [Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "contentDeepHashCode"
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)I"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Arrays;->deepHashCode([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟(II)V
    .locals 3
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    if-gt p0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "toIndex ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ") is greater than size ("

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic ۥ۟۟۟([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const-string p0, "T?"

    const/4 v0, 0x0

    invoke-static {v0, p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    new-array p0, v0, [Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public static final ۥ۟۟۟۟([BLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟۠(Ljava/util/Collection;)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+TT;>;)[TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "T?"

    const/4 v1, 0x0

    invoke-static {v1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    new-array v0, v1, [Ljava/lang/Object;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
