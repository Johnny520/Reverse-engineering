.class public LYue/ۥۣۢۦۢ;
.super LYue/ۥۣۢۦۡ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟ۡ۠:Z = false

.field public static final ۥ۟۟ۡۡ:Ljava/lang/String; = "VersionedParcelParcel"


# instance fields
.field public final ۥۣ۟۟۠:Landroid/util/SparseIntArray;

.field public final ۥ۟۟۠ۤ:Landroid/os/Parcel;

.field public final ۥ۟۟۠ۥ:I

.field public final ۥ۟۟۠ۦ:I

.field public final ۥ۟۟۠ۧ:Ljava/lang/String;

.field public ۥ۟۟۠ۨ:I

.field public ۥ۟۟ۡ:I

.field public ۥ۟۟ۡ۟:I


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    invoke-virtual {p1}, Landroid/os/Parcel;->dataSize()I

    move-result v3

    new-instance v5, LYue/ۥ۟ۡۨۡ;

    invoke-direct {v5}, LYue/ۥ۟ۡۨۡ;-><init>()V

    new-instance v6, LYue/ۥ۟ۡۨۡ;

    invoke-direct {v6}, LYue/ۥ۟ۡۨۡ;-><init>()V

    new-instance v7, LYue/ۥ۟ۡۨۡ;

    invoke-direct {v7}, LYue/ۥ۟ۡۨۡ;-><init>()V

    const-string v4, ""

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, LYue/ۥۣۢۦۢ;-><init>(Landroid/os/Parcel;IILjava/lang/String;LYue/ۥ۟ۡۨۡ;LYue/ۥ۟ۡۨۡ;LYue/ۥ۟ۡۨۡ;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;IILjava/lang/String;LYue/ۥ۟ۡۨۡ;LYue/ۥ۟ۡۨۡ;LYue/ۥ۟ۡۨۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            "II",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06df\u06e1\u06e8\u06e1<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;",
            "LYue/\u06e5\u06df\u06e1\u06e8\u06e1<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;",
            "LYue/\u06e5\u06df\u06e1\u06e8\u06e1<",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p5, p6, p7}, LYue/ۥۣۢۦۡ;-><init>(LYue/ۥ۟ۡۨۡ;LYue/ۥ۟ۡۨۡ;LYue/ۥ۟ۡۨۡ;)V

    .line 3
    new-instance p5, Landroid/util/SparseIntArray;

    invoke-direct {p5}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p5, p0, LYue/ۥۣۢۦۢ;->ۥۣ۟۟۠:Landroid/util/SparseIntArray;

    const/4 p5, -0x1

    .line 4
    iput p5, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۨ:I

    .line 5
    iput p5, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟ۡ۟:I

    .line 6
    iput-object p1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    .line 7
    iput p2, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۥ:I

    .line 8
    iput p3, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۦ:I

    .line 9
    iput p2, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟ۡ:I

    .line 10
    iput-object p4, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 4

    iget v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۨ:I

    if-ltz v0, :cond_0

    iget-object v1, p0, LYue/ۥۣۢۦۢ;->ۥۣ۟۟۠:Landroid/util/SparseIntArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    iget-object v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    sub-int v2, v1, v0

    iget-object v3, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟()LYue/ۥۣۢۦۡ;
    .locals 9

    new-instance v8, LYue/ۥۣۢۦۢ;

    iget-object v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    iget v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟ۡ:I

    iget v3, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۥ:I

    if-ne v0, v3, :cond_0

    iget v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۦ:I

    :cond_0
    move v3, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, LYue/ۥۣۢۦۡ;->ۥ:LYue/ۥ۟ۡۨۡ;

    iget-object v6, p0, LYue/ۥۣۢۦۡ;->ۥ۟:LYue/ۥ۟ۡۨۡ;

    iget-object v7, p0, LYue/ۥۣۢۦۡ;->ۥ۟۟:LYue/ۥ۟ۡۨۡ;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LYue/ۥۣۢۦۢ;-><init>(Landroid/os/Parcel;IILjava/lang/String;LYue/ۥ۟ۡۨۡ;LYue/ۥ۟ۡۨۡ;LYue/ۥ۟ۡۨۡ;)V

    return-object v8
.end method

.method public ۥ۟۟۟ۦ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۠۟()Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۢ()[B
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-array v0, v0, [B

    iget-object v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readByteArray([B)V

    return-object v0
.end method

.method public ۥ۟۟۠ۥ()Ljava/lang/CharSequence;
    .locals 2

    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    iget-object v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۠ۨ()D
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟ۡۤ(I)Z
    .locals 4

    :goto_0
    iget v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟ۡ:I

    iget v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۦ:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_2

    iget v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟ۡ۟:I

    if-ne v0, p1, :cond_0

    return v3

    :cond_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    iget v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟ۡ:I

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iget-object v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟ۡ۟:I

    iget v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟ۡ:I

    add-int/2addr v1, v0

    iput v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟ۡ:I

    goto :goto_0

    :cond_2
    iget v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟ۡ۟:I

    if-ne v0, p1, :cond_3

    move v2, v3

    :cond_3
    return v2
.end method

.method public ۥ۟۟ۡۥ()F
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۢ۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۢۤ()J
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥۣ۟۟()Landroid/os/Parcelable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟ۥ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟ۧ()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۤ۠(I)V
    .locals 2

    invoke-virtual {p0}, LYue/ۥۣۢۦۢ;->ۥ()V

    iput p1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۨ:I

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥۣ۟۟۠:Landroid/util/SparseIntArray;

    iget-object v1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->put(II)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥۣۢۦۢ;->ۥ۟۟ۦۧ(I)V

    invoke-virtual {p0, p1}, LYue/ۥۣۢۦۢ;->ۥ۟۟ۦۧ(I)V

    return-void
.end method

.method public ۥ۟۟ۤۤ(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public ۥ۟۟ۤۨ(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method

.method public ۥ۟۟ۥ۠([B)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    array-length v1, p1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟ۥۢ([BII)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    array-length v1, p1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Parcel;->writeByteArray([BII)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟ۥۥ(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    return-void
.end method

.method public ۥ۟۟ۦ(D)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1, p2}, Landroid/os/Parcel;->writeDouble(D)V

    return-void
.end method

.method public ۥ۟۟ۦۣ(F)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method

.method public ۥ۟۟ۦۧ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public ۥ۟۟ۧۡ(J)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method

.method public ۥ۟۟ۧۧ(Landroid/os/Parcelable;)V
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

.method public ۥ۟۟ۨۤ(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۨۦ(Landroid/os/IBinder;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    return-void
.end method

.method public ۥ۟۟ۨۨ(Landroid/os/IInterface;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۦۢ;->ۥ۟۟۠ۤ:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    return-void
.end method
