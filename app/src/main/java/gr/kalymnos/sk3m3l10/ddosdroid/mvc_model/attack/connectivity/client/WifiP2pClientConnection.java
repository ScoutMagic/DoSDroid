package gr.kalymnos.sk3m3l10.ddosdroid.mvc_model.attack.connectivity.client;

import android.content.Context;

import gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Attack;

class WifiP2pClientConnection extends ClientConnection {

    WifiP2pClientConnection(Context context, Attack attack) {
        super(context, attack);
    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    protected void releaseResources() {

    }
}