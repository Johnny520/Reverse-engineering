.class public LYue/ۥۣ۟ۡۤ$ۥ۟۟۟ۡ;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۡۤ;
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
            "LYue/\u06e5\u06df\u06e1\u06e3\u06e4$\u06e5\u06df\u06df\u06df\u06e1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public ۥۣ۟۟۠:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟ۡ$ۥ;

    invoke-direct {v0}, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟ۡ$ۥ;-><init>()V

    sput-object v0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟ۡ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    iget-boolean p2, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
