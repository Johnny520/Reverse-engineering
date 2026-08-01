.class public Lnet/bytebuddy/TypeCache$StorageKey;
.super Ljava/lang/ref/WeakReference;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/TypeCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StorageKey"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference<",
        "Ljava/lang/ClassLoader;",
        ">;"
    }
.end annotation


# instance fields
.field private final hashCode:I


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/ref/ReferenceQueue<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lnet/bytebuddy/TypeCache$StorageKey;->hashCode:I

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic access$100(Lnet/bytebuddy/TypeCache$StorageKey;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/TypeCache$StorageKey;->hashCode:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/bytebuddy/TypeCache$LookupKey;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lnet/bytebuddy/TypeCache$LookupKey;

    .line 11
    .line 12
    iget v1, p0, Lnet/bytebuddy/TypeCache$StorageKey;->hashCode:I

    .line 13
    .line 14
    invoke-static {p1}, Lnet/bytebuddy/TypeCache$LookupKey;->access$200(Lnet/bytebuddy/TypeCache$LookupKey;)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ne v1, v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p1}, Lnet/bytebuddy/TypeCache$LookupKey;->access$300(Lnet/bytebuddy/TypeCache$LookupKey;)Ljava/lang/ClassLoader;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-ne p0, p1, :cond_1

    .line 29
    .line 30
    return v0

    .line 31
    :cond_1
    return v2

    .line 32
    :cond_2
    instance-of v1, p1, Lnet/bytebuddy/TypeCache$StorageKey;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    check-cast p1, Lnet/bytebuddy/TypeCache$StorageKey;

    .line 37
    .line 38
    iget v1, p0, Lnet/bytebuddy/TypeCache$StorageKey;->hashCode:I

    .line 39
    .line 40
    iget v3, p1, Lnet/bytebuddy/TypeCache$StorageKey;->hashCode:I

    .line 41
    .line 42
    if-ne v1, v3, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p0, p1, :cond_3

    .line 53
    .line 54
    return v0

    .line 55
    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/TypeCache$StorageKey;->hashCode:I

    .line 2
    .line 3
    return p0
.end method
