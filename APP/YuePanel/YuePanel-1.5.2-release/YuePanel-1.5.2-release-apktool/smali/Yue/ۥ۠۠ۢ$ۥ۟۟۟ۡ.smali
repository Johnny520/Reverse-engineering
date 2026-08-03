.class public LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;
.super LYue/ۥۣ۟۟۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LYue/\u06e5\u06e0\u06e0\u06e2$\u06e5\u06df\u06df\u06df\u06e1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public ۥۣ۟۟۠:I

.field public ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I

.field public ۥ۟۟۠ۧ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ$ۥ;

    invoke-direct {v0}, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ$ۥ;-><init>()V

    sput-object v0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .locals 0
    .param p1    # Landroid/os/Parcel;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, LYue/ۥۣ۟۟۠;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    const/4 p2, 0x0

    .line 2
    iput p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:I

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:I

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:I

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:I

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ:I

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۧ:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .locals 0
    .param p1    # Landroid/os/Parcelable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 8
    invoke-direct {p0, p1}, LYue/ۥۣ۟۟۠;-><init>(Landroid/os/Parcelable;)V

    const/4 p1, 0x0

    .line 9
    iput p1, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟۠;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۧ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
