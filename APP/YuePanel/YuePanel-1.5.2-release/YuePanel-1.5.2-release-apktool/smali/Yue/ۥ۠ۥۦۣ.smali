.class public final LYue/ۥ۠ۥۦۣ;
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۥۦۣ$ۥ;,
        LYue/ۥ۠ۥۦۣ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LYue/\u06e5\u06e0\u06e5\u06e6\u06e3;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۠ۧ:LYue/ۥ۠ۥۦۣ$ۥ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥۣ۟۟۠:Landroid/content/IntentSender;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Landroid/content/Intent;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:I

.field public final ۥ۟۟۠ۦ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۠ۥۦۣ$ۥ۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۥۦۣ$ۥ۟۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۥۦۣ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۥۦۣ$ۥ۟۟;

    new-instance v0, LYue/ۥ۠ۥۦۣ$ۥ۟;

    invoke-direct {v0}, LYue/ۥ۠ۥۦۣ$ۥ۟;-><init>()V

    sput-object v0, LYue/ۥ۠ۥۦۣ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V
    .locals 1
    .param p1    # Landroid/content/IntentSender;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const-string v0, "intentSender"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥ۠ۥۦۣ;->ۥۣ۟۟۠:Landroid/content/IntentSender;

    .line 3
    iput-object p2, p0, LYue/ۥ۠ۥۦۣ;->ۥ۟۟۠ۤ:Landroid/content/Intent;

    .line 4
    iput p3, p0, LYue/ۥ۠ۥۦۣ;->ۥ۟۟۠ۥ:I

    .line 5
    iput p4, p0, LYue/ۥ۠ۥۦۣ;->ۥ۟۟۠ۦ:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/IntentSender;Landroid/content/Intent;IIILYue/ۥ۟ۨۥۢ;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LYue/ۥ۠ۥۦۣ;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "parcel"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const-class v0, Landroid/content/IntentSender;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    check-cast v0, Landroid/content/IntentSender;

    .line 8
    const-class v1, Landroid/content/Intent;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/Intent;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 11
    invoke-direct {p0, v0, v1, v2, p1}, LYue/ۥ۠ۥۦۣ;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "dest"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۥۦۣ;->ۥۣ۟۟۠:Landroid/content/IntentSender;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, LYue/ۥ۠ۥۦۣ;->ۥ۟۟۠ۤ:Landroid/content/Intent;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget p2, p0, LYue/ۥ۠ۥۦۣ;->ۥ۟۟۠ۥ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LYue/ۥ۠ۥۦۣ;->ۥ۟۟۠ۦ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public final ۥ()Landroid/content/Intent;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۦۣ;->ۥ۟۟۠ۤ:Landroid/content/Intent;

    return-object v0
.end method

.method public final ۥ۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۥۦۣ;->ۥ۟۟۠ۥ:I

    return v0
.end method

.method public final ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۥۦۣ;->ۥ۟۟۠ۦ:I

    return v0
.end method

.method public final ۥ۟۟۟۠()Landroid/content/IntentSender;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۦۣ;->ۥۣ۟۟۠:Landroid/content/IntentSender;

    return-object v0
.end method
