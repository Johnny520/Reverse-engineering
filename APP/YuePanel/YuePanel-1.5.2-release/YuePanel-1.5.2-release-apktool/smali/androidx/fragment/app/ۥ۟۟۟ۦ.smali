.class public final Landroidx/fragment/app/ۥ۟۟۟ۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/\u06e5\u06df\u06df\u06df\u06e6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/String;

.field public final ۥ۟۟۠ۤ:Ljava/lang/String;

.field public final ۥ۟۟۠ۥ:Z

.field public final ۥ۟۟۠ۦ:I

.field public final ۥ۟۟۠ۧ:I

.field public final ۥ۟۟۠ۨ:Ljava/lang/String;

.field public final ۥ۟۟ۡ:Z

.field public final ۥ۟۟ۡ۟:Z

.field public final ۥ۟۟ۡ۠:Z

.field public final ۥ۟۟ۡۡ:Z

.field public final ۥ۟۟ۡۢ:I

.field public final ۥۣ۟۟ۡ:Ljava/lang/String;

.field public final ۥ۟۟ۡۤ:I

.field public final ۥ۟۟ۡۥ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/fragment/app/ۥ۟۟۟ۦ$ۥ;

    invoke-direct {v0}, Landroidx/fragment/app/ۥ۟۟۟ۦ$ۥ;-><init>()V

    sput-object v0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟۠:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۥ:Z

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ:I

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۧ:I

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ:Z

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۟:Z

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۠:Z

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    move v0, v1

    :goto_4
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۡ:Z

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۢ:I

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۤ:I

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    iput-boolean v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۥ:Z

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟۠:Ljava/lang/String;

    .line 3
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    .line 4
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mFromLayout:Z

    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۥ:Z

    .line 5
    iget v0, p1, Landroidx/fragment/app/Fragment;->mFragmentId:I

    iput v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ:I

    .line 6
    iget v0, p1, Landroidx/fragment/app/Fragment;->mContainerId:I

    iput v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۧ:I

    .line 7
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    .line 8
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mRetainInstance:Z

    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ:Z

    .line 9
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۟:Z

    .line 10
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۠:Z

    .line 11
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mHidden:Z

    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۡ:Z

    .line 12
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mMaxState:Landroidx/lifecycle/Lifecycle$State;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۢ:I

    .line 13
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mTargetWho:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    .line 14
    iget v0, p1, Landroidx/fragment/app/Fragment;->mTargetRequestCode:I

    iput v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۤ:I

    .line 15
    iget-boolean p1, p1, Landroidx/fragment/app/Fragment;->mUserVisibleHint:Z

    iput-boolean p1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۥ:Z

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentState{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")}:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۥ:Z

    if-eqz v1, :cond_0

    const-string v1, " fromLayout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۧ:I

    if-eqz v1, :cond_1

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-boolean v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ:Z

    if-eqz v1, :cond_3

    const-string v1, " retainInstance"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-boolean v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۟:Z

    if-eqz v1, :cond_4

    const-string v1, " removing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-boolean v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۠:Z

    if-eqz v1, :cond_5

    const-string v1, " detached"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-boolean v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۡ:Z

    if-eqz v1, :cond_6

    const-string v1, " hidden"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    if-eqz v1, :cond_7

    const-string v1, " targetWho="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " targetRequestCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۤ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_7
    iget-boolean v1, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۥ:Z

    if-eqz v1, :cond_8

    const-string v1, " userVisibleHint"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۥ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۧ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۟:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۠:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۡ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۢ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۤ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۥ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public ۥ(Landroidx/fragment/app/ۥ۟۟۟ۡ;Ljava/lang/ClassLoader;)Landroidx/fragment/app/Fragment;
    .locals 1
    .param p1    # Landroidx/fragment/app/ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/ۥ۟۟۟ۡ;->ۥ(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    iget-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۥ:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mFromLayout:Z

    const/4 p2, 0x1

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mRestored:Z

    iget p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ:I

    iput p2, p1, Landroidx/fragment/app/Fragment;->mFragmentId:I

    iget p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۧ:I

    iput p2, p1, Landroidx/fragment/app/Fragment;->mContainerId:I

    iget-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mRetainInstance:Z

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۟:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۠:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۡ:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mHidden:Z

    invoke-static {}, Landroidx/lifecycle/Lifecycle$State;->values()[Landroidx/lifecycle/Lifecycle$State;

    move-result-object p2

    iget v0, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۢ:I

    aget-object p2, p2, v0

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mMaxState:Landroidx/lifecycle/Lifecycle$State;

    iget-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mTargetWho:Ljava/lang/String;

    iget p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۤ:I

    iput p2, p1, Landroidx/fragment/app/Fragment;->mTargetRequestCode:I

    iget-boolean p2, p0, Landroidx/fragment/app/ۥ۟۟۟ۦ;->ۥ۟۟ۡۥ:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mUserVisibleHint:Z

    return-object p1
.end method
