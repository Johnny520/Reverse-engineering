.class public final Landroidx/drawerlayout/R$attr;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "attr"
.end annotation


# static fields
.field public static alpha:I

.field public static font:I

.field public static fontProviderAuthority:I

.field public static fontProviderCerts:I

.field public static fontProviderFetchStrategy:I

.field public static fontProviderFetchTimeout:I

.field public static fontProviderPackage:I

.field public static fontProviderQuery:I

.field public static fontStyle:I

.field public static fontVariationSettings:I

.field public static fontWeight:I

.field public static ttcIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x7f040029

    sput v0, Landroidx/drawerlayout/R$attr;->alpha:I

    const v0, 0x7f040081

    sput v0, Landroidx/drawerlayout/R$attr;->font:I

    const v0, 0x7f040083

    sput v0, Landroidx/drawerlayout/R$attr;->fontProviderAuthority:I

    const v0, 0x7f040084

    sput v0, Landroidx/drawerlayout/R$attr;->fontProviderCerts:I

    const v0, 0x7f040085

    sput v0, Landroidx/drawerlayout/R$attr;->fontProviderFetchStrategy:I

    const v0, 0x7f040086

    sput v0, Landroidx/drawerlayout/R$attr;->fontProviderFetchTimeout:I

    const v0, 0x7f040087

    sput v0, Landroidx/drawerlayout/R$attr;->fontProviderPackage:I

    const v0, 0x7f040088

    sput v0, Landroidx/drawerlayout/R$attr;->fontProviderQuery:I

    const v0, 0x7f04008a

    sput v0, Landroidx/drawerlayout/R$attr;->fontStyle:I

    const v0, 0x7f04008b

    sput v0, Landroidx/drawerlayout/R$attr;->fontVariationSettings:I

    const v0, 0x7f04008c

    sput v0, Landroidx/drawerlayout/R$attr;->fontWeight:I

    const v0, 0x7f040114

    sput v0, Landroidx/drawerlayout/R$attr;->ttcIndex:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "eRHGOCdarbRVxdt2Fr0PPbVB"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۣۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
