.class public final LUC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Las;


# static fields
.field public static final b:LUC;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUC;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LUC;-><init>(I)V

    sput-object v0, LUC;->b:LUC;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LUC;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LUC;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    check-cast p1, Ljava/io/File;

    const/4 p1, 0x1

    return p1

    :pswitch_1
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;IILvt;)LZr;
    .locals 1

    iget p2, p0, LUC;->a:I

    packed-switch p2, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/io/File;

    new-instance p2, LZr;

    new-instance p3, Let;

    invoke-direct {p3, p1}, Let;-><init>(Ljava/lang/Object;)V

    new-instance p4, Ll6;

    const/4 v0, 0x0

    invoke-direct {p4, v0, p1}, Ll6;-><init>(ILjava/lang/Object;)V

    invoke-direct {p2, p3, p4}, LZr;-><init>(LSm;Ltc;)V

    return-object p2

    :pswitch_1
    new-instance p2, LZr;

    new-instance p3, Let;

    invoke-direct {p3, p1}, Let;-><init>(Ljava/lang/Object;)V

    new-instance p4, Ll6;

    const/4 v0, 0x1

    invoke-direct {p4, v0, p1}, Ll6;-><init>(ILjava/lang/Object;)V

    invoke-direct {p2, p3, p4}, LZr;-><init>(LSm;Ltc;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
